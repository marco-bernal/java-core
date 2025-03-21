//package com.mab.core.old.io;
//
//import lombok.extern.slf4j.Slf4j;
//import org.apache.commons.io.FileUtils;
//
//import java.io.File;
//import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//import java.util.List;
//import java.util.stream.Collectors;
//
//import static java.io.File.separatorChar;
//
////TODO: Refactor and Add unit tests
//
//@Slf4j
//class TempFolder {
//
//    void createMiraxTmpFolder(String filePathDrectory) {
//
//        // /tmp/mab/images/mirax/noZipFile/GO272537_82653943739X_HE
//        Path tmpDir = Paths.get(System.getProperty("java.io.tmpdir") + separatorChar + filePathDrectory);
//
//        try {
//            //can't create tempFolder because every notification the folder would be different
//            if (!tmpDir.toFile().exists()) {
//                File miraxTmpFolder = Files.createDirectories(tmpDir).toFile();
//                log.info("Temp folder: {} created.", tmpDir);
//                //copy file
//            } else {
//                //just copy files
//                log.info("Temp folder: {} already exist.", tmpDir);
//            }
//
//        } catch (IOException e) {
//            log.error("Error creating temp folder: {}", e);
//        }
//    }
//
//
//    void deleteFolder(String folderPath) {
//        File folder = new File(folderPath);
//
//        if (folder.exists() && folder.isDirectory()) {
//            try {
//                FileUtils.deleteDirectory(folder);
//            } catch (IOException e) {
//                log.error("Error while deleting folder: {}", folder);
//            }
//        }
//    }
//
//
////    boolean isMiraxFolder(String filePath) throws IOException {
////        String folder = Paths.get(filePath).getParent().toString();
////
////        List<String> files = Files.list(Paths.get(folder))
////                .filter(file -> file.toString().endsWith(".ini") || file.toString().endsWith(".dat"))
////                .map(Object::toString)
////                .collect(Collectors.toList());
////
////        if (!files.isEmpty()) {
////            files.forEach(file -> log.info(""));
////            return true;
////        }
////
////        if (filePath.substring(filePath.lastIndexOf(".") + 1).equals(folder)) {
////            return true;
////        }
////
////        return false;
////    }
//}
