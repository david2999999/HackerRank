package Interview;

import java.util.Hashtable;

public class CountSizeOfFiles {
    public static void main(String[] args) {
        System.out.println(solution("my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b"));

    }
    public static String solution(String S) {
        StringBuilder sb = new StringBuilder();
        String[] lines = S.split("\\n");
        Hashtable<String, String> fileType = generateTableForMusicType();
        int musicSize = 0;
        int imageSize = 0;
        int movieSize = 0;
        int otherSize = 0;

        for (String s: lines) {
            String[] filesAndSize = s.split(" ");

            for(int i = 0; i < filesAndSize.length - 1; i += 2) {
                String file = filesAndSize[i];
                String size = filesAndSize[i + 1];

                String[] fileArr = file.split("\\.");
                String fileSize = size.substring(0, size.length() - 1);

                String type = fileType.get(fileArr[fileArr.length - 1]);

                if (type == null) {
                    otherSize += Integer.parseInt(fileSize);
                } else {
                    switch (type) {
                        case "music":
                            musicSize += Integer.parseInt(fileSize);
                            break;
                        case "movie":
                            movieSize += Integer.parseInt(fileSize);
                            break;
                        case "image":
                            imageSize += Integer.parseInt(fileSize);
                            break;
                    }
                }
            }
        }

        sb.append("music " + musicSize + "b\n");
        sb.append("images " + imageSize + "b\n");
        sb.append("movies " + movieSize + "b\n");
        sb.append("other " + otherSize + "b\n");
        return sb.toString();
    }

    public static Hashtable<String, String> generateTableForMusicType() {
        Hashtable<String, String> map = new Hashtable<>();

        map.put("mp3", "music");
        map.put("aac", "music");
        map.put("flac", "music");
        map.put("jpg", "image");
        map.put("bmp", "image");
        map.put("gif", "image");
        map.put("mp4", "movie");
        map.put("avi", "movie");
        map.put("mkv", "movie");

        return map;
    }
}
