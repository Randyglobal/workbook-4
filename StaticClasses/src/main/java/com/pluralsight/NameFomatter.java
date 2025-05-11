package com.pluralsight;

public class NameFomatter {
    private static String firstName = "";
    private static String lastName = "";
    private static String middleName = "";
    private static String prefix = "";
    private static String suffix = "";

    private NameFomatter() {
    }
    public static String format(String firstName, String lastName){
        return firstName + "," + lastName;
    }
    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        StringBuilder nameFormatter = new StringBuilder();
        nameFormatter.append(lastName).append(",");
        if (prefix != null && !prefix.isEmpty()){
            nameFormatter.append(prefix).append(" ");
        }
        nameFormatter.append(firstName);
        if (middleName != null && !middleName.isEmpty()){
            nameFormatter.append(" ").append(middleName).append(",");
        }
        if (suffix != null && !suffix.isEmpty()){
            nameFormatter.append(" ").append(suffix);
        }
        return nameFormatter.toString();
    }
    public static String format(String fullName) {

        String[] parts = fullName.split("\\s+");
        String firstName = "";
        String lastName = "";
        String prefix = "";
        String middleName = "";
        String suffix = "";

        // Using Simple heuristic approach
        if (parts.length >= 2) {
            lastName = parts[parts.length - 1];
            firstName = parts[0];

            if (parts.length > 2) {
                // identify prefix and suffix
                String firstPart = parts[0].trim().toLowerCase();
                if (firstPart.equals("Mr.") || firstPart.equals("Mrs.") || firstPart.equals("Miss.") || firstPart.equals("Dr.")) {
                    prefix = parts[0];
                    firstName = parts[1];
                    if (parts.length > 3 && parts[parts.length - 1].trim().toLowerCase().equals("jr.")) {
                        lastName = parts[parts.length - 2];
                        suffix = parts[parts.length - 1];
                        // Handle potential middle names if given
                        for (int i = 2; i < parts.length - 2; i++) {
                            middleName += parts[i] + " ";
                        }
                        middleName = middleName.trim();
                    } else if (parts.length > 3 && (parts[parts.length - 1].trim().toLowerCase().equals("PhD") || parts[parts.length - 1].matches("iii|iv|v"))) {
                        lastName = parts[parts.length - 2];
                        suffix = parts[parts.length - 1];
                        for (int i = 2; i < parts.length - 2; i++) {
                            middleName += parts[i] + " ";
                        }
                        middleName = middleName.trim();
                    } else {
                        // Assume middle names if present
                        for (int i = 1; i < parts.length - 1; i++) {
                            middleName += parts[i] + " ";
                        }
                        middleName = middleName.trim();
                    }
                } else {
                    if (parts.length > 2 && parts[parts.length - 1].trim().toLowerCase().equals("Jr.")) {
                        lastName = parts[parts.length - 2];
                        suffix = parts[parts.length - 1];
                        for (int i = 1; i < parts.length - 2; i++) {
                            middleName += parts[i] + " ";
                        }
                        middleName = middleName.trim();
                    } else if (parts.length > 2 && (parts[parts.length - 1].trim().toLowerCase().equals("PhD") || parts[parts.length - 1].matches("iii|iv|v"))) {
                        lastName = parts[parts.length - 2];
                        suffix = parts[parts.length - 1];
                        for (int i = 1; i < parts.length - 2; i++) {
                            middleName += parts[i] + " ";
                        }
                        middleName = middleName.trim();
                    } else {
                        for (int i = 1; i < parts.length - 1; i++) {
                            middleName += parts[i] + " ";
                        }
                        middleName = middleName.trim();
                    }
                }
            }
        }

//        Arranging the order of names
        StringBuilder formattedName = new StringBuilder();
        if (!prefix.isEmpty()) {
            formattedName.append(prefix).append(" ");
        }
        formattedName.append(firstName);
        if (!middleName.isEmpty()) {
            formattedName.append(" ").append(middleName);
        }
        formattedName.append(lastName).append(", ");
        if (!suffix.isEmpty()) {
            formattedName.append(suffix);
        }

        return formattedName.toString().trim();
    }
}
