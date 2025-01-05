package com.mab.core.old.io;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

import static java.io.File.separatorChar;
import static java.lang.Integer.parseInt;

//TODO: Refactor and Add tests

@Slf4j
public class ValidateFileContent {

    //TODO: validator
    boolean isMiraxFileComplete(String folderPath) {
        String slidedatFile = folderPath + separatorChar + "Slidedat.ini";
        log.info("slidedatFile: {}", slidedatFile);

        List<String> extractedFiles = extractDataFilesList(slidedatFile);
        List<String> missingFiles = new ArrayList<>();

        AtomicBoolean fileExist = new AtomicBoolean(false);

        extractedFiles.forEach(file -> {
            fileExist.set(fileExist(folderPath + separatorChar + file));
            log.info("file to validate: {}, result: {}", folderPath + separatorChar + file, fileExist.get());

            if (!fileExist.get()) {
                missingFiles.add(file);
            }
        });

        if (missingFiles.isEmpty()) {
            return true;
        } else {
            missingFiles.forEach(file ->
                    log.info("File missing: {}", file));
        }

        return false;
    }

    //TODO: utils
    private List<String> extractDataFilesList(String slidedatFile) {

        List<String> files = new ArrayList<>();
        int counter = 0;
        int fileCount = 0;

        try (Scanner s = new Scanner(new FileReader(slidedatFile))) {
            while (s.hasNext()) {

                String line = s.nextLine();
                //log.info("line: {}", line);

                if (line.contains("FILE_COUNT")) { //23
                    fileCount = parseInt(extractValue(line));
                    //log.info("fileCount: {}", fileCount);
                }


                if (line.contains("FILE_" + counter)) {
                    files.add(extractValue(line));
                    counter += 1;

                    if (counter == fileCount) {
                        break;
                    }
                }
            }

        } catch (FileNotFoundException e) {
            log.error("File: {} not found", slidedatFile, e);
        }

        return files;
    }

    private String extractValue(String line) {
        return line.substring(line.lastIndexOf('=') + 1).trim();
    }

    private boolean fileExist(String filePath) {
        File file = new File(filePath);
        return file.exists();
    }


    void copyFile(String source, String target) {
        try {
            FileUtils.copyFile(FileUtils.getFile(source), FileUtils.getFile(target));
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
