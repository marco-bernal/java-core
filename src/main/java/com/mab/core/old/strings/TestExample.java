package com.mab.core.old.strings;


import java.io.File;

import static java.nio.file.Paths.get;

//TODO: Refactor, delete main method, add unit tests, and change the url to anything than Mirax images

public class TestExample {

    public static void main(String args[]) {
//        System.out.println(extractFileName("images/mirax/GO253638_928373X_HNE.mrxs"));
//        System.out.println(extractFileName("GO253638_928373X_HNE.mrxs"));
//
//        System.out.println(extractMiraxParentFolder("images/mirax/GO253638_928373X_HNE.mrxs"));
//        System.out.println(extractMiraxParentFolder("GO253638_928373X_HNE.mrxs"));
//
//
        System.out.println(getFileName("images/mirax/GO253638_928373X_HNE.mrxs"));
        System.out.println(getFileName("images/mirax/GO253638_928373X_HNE/00001.dat"));

//        System.out.println(getMiraxFolder("images/mirax/GO253638_928373X_HNE.mrxs"));
//        System.out.println(getMiraxFolder("GO253638_928373X_HNE.mrxs"));
//        System.out.println(getFolderName("images/mirax/GO253638_928373X_HNE/00001.dat"));


        System.out.println(extractFolder("images/mirax/SL0001.mrxs")); //F
        System.out.println(extractFolder("images/mirax/SL00GAH.bif")); //F
        System.out.println(extractFolder("images/mirax/SL0001/SL00JSH.svs")); //T
        String folder = extractFolder("GO253638_928373X_HNE.bif");
        if (folder.isEmpty()) {
            System.out.println("GO253638_928373X_HNE.bif has no folder");
        }

        System.out.println(extractFileName("images/mirax/SL0001.mrxs"));


        System.out.println(getFileNameWithExtension("images/mirax/SL0001/Dat0000.dat"));
        System.out.println(getFileNameWithExtension("images/mirax/SL0001.mrxs"));
        System.out.println(getFileNameWithExtension("SL0001.svs"));


//        String filePath = "images/mirax/GO253638_928373X_HNE/SL0001.bif";
//        System.out.println(filePath.substring(filePath.lastIndexOf('/') + 1, filePath.lastIndexOf('.')));
//        System.out.println(getFolderName(filePath));

//        String folder = "/usr/local/mab/mein/Projects/Java/FlatMirax/GO28915_05850110C0001X_HE";
//        System.out.println(fileIsDirectory(folder));
//        System.out.println(fileIsDirectory(folder + ".mrxs"));
//        System.out.println(fileIsDirectory(folder + separatorChar + "myFoldeer"));
//
//        String tmpRoot = System.getProperty("java.io.tmpdir");
//        System.out.println("Tmp folder: " + tmpRoot);
//        System.out.println(getFinalMiraxFolder(tmpRoot + separatorChar + "images/mirax/GO253638_928373X_HNE.mrxs"));
//        System.out.println(getFinalMiraxFolder(tmpRoot + separatorChar + "images/mirax/GO253638_928373X_HNE/00001.dat"));

//        System.out.println(Paths.get("images/mirax/GO253638_928373X_HNE/GO253638_928373X_HNE.mrxs").getFileName().toString());
//        System.out.println(Paths.get("images/mirax/GO253638_928373X_HNE/GO253638_928373X_HNE.mrxs").getParent().toString());
//        System.out.println(Paths.get("images/mirax/GO253638_928373X_HNE/GO253638_928373X_HNE.mrxs").getFileName().toAbsolutePath().toString());
//
//        System.out.println(String.format("Extracted filepath: %1$s and parent folder: %2$s",
//                extractFileName("images/mirax/GO253638_928373X_HNE/GO253638_928373X_HNE.mrxs"),
//                extractParentFolder("images/mirax/GO253638_928373X_HNE")));

    }

    public static String extractFileName(String fullFilePath) {
        return fullFilePath.substring(fullFilePath.lastIndexOf('/') + 1, fullFilePath.lastIndexOf('.'));
    }

    public static String extractMiraxParentFolder(String fullFilePath) {
        return fullFilePath.lastIndexOf('/') == 0 ? fullFilePath.substring(fullFilePath.lastIndexOf('.')) :
                fullFilePath.substring(fullFilePath.lastIndexOf('/') + 1, fullFilePath.lastIndexOf('.'));
    }

    static String getFileName(String filePath) {
        return get(filePath).getFileName().toString();
    }

    static String getFolderName(String filePath) {
        return get(filePath).getParent().toString();
    }

    static String getMiraxFolder(String filePath) {
        return filePath.substring(0, filePath.lastIndexOf('.'));
    }

    static boolean fileIsDirectory(String folder) {
        File file = new File(folder);
        return file.exists() && file.isDirectory();
    }

    static String getFinalMiraxFolder(String tmpFileName) {
        String tmpFolder = getMiraxFolder(tmpFileName);
        return tmpFolder.replace(System.getProperty("java.io.tmpdir"), "");
    }

    static String extractFolder(String filePath) {
        String folderPath = filePath.contains("/") ? filePath.substring(0, filePath.lastIndexOf('/')) : "";
        System.out.println("folderPath: " + folderPath);
        return folderPath.lastIndexOf('/') != 0 ? folderPath.substring(0, folderPath.lastIndexOf('/') + 1) : "";
    }

    static String getFileNameWithExtension(String filePath) {
        return filePath.contains("/") ? filePath.substring(filePath.lastIndexOf('/') + 1) :
                filePath;
    }
}
