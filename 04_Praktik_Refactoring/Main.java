// Enum untuk Genre
enum GenreType {
    UNDEFINED, POP, ROCK, HIPHOP, RNB, JAZZ, INSTRUMENTALS, CLOWNCORE;
}

// Class untuk Album
class Album {
    private String name;
    private String coverURL;

    public Album(String name, String coverURL) {
        this.name = name;
        this.coverURL = coverURL;
    }

    public String getName() {
        return name;
    }

    public String getCoverURL() {
        return coverURL;
    }
}

// Class untuk Artist
class Artist {
    private String name;
    private String alias;
    private String imageURL;

    public Artist(String name, String alias, String imageURL) {
        this.name = name;
        this.alias = alias;
        this.imageURL = imageURL;
    }

    public String getName() {
        return name;
    }

    public String getAlias() {
        return alias;
    }

    public String getImageURL() {
        return imageURL;
    }
}

// Class untuk Song
class Song {
    private String title;
    private int releaseYear;
    private GenreType genre;
    private Album album;
    private Artist artist;

    public Song(String title, int releaseYear, GenreType genre, Album album, Artist artist) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.genre = genre != null ? genre : GenreType.UNDEFINED;
        this.album = album;
        this.artist = artist;
    }

    public void printInfo(int detailLevel) {
        printBasicInfo();
        if (detailLevel >= 1) {
            printArtistInfo();
        }
        if (detailLevel >= 2) {
            printAlbumInfo();
        }
    }

    private void printBasicInfo() {
        System.out.println("Song Title: " + title);
        System.out.println("Release Year: " + releaseYear);
        if (genre != GenreType.UNDEFINED) {
            System.out.println("Genre: " + genre);
        }
    }

    private void printArtistInfo() {
        if (artist != null) {
            System.out.println("Artist Name: " + artist.getName());
            if (!artist.getAlias().isEmpty()) {
                System.out.println("Also Known As: " + artist.getAlias());
            }
        }
    }

    private void printAlbumInfo() {
        if (album != null) {
            System.out.println("Album Title: " + album.getName());
        }
    }
}

// Main Class untuk Testing
public class Main {
    public static void main(String[] args) {
        // Membuat objek Artist dan Album
        Artist artist = new Artist("John Doe", "JD", "https://image.url/john.jpg");
        Album album = new Album("Greatest Hits", "https://image.url/album.jpg");

        // Membuat objek Song
        Song song = new Song("My Song", 2022, GenreType.POP, album, artist);

        // Menampilkan informasi lagu dengan berbagai detail level
        System.out.println("=== Detail Level 0 ===");
        song.printInfo(0);

        System.out.println("\n=== Detail Level 1 ===");
        song.printInfo(1);

        System.out.println("\n=== Detail Level 2 ===");
        song.printInfo(2);
    }
}
