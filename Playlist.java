import java.util.ArrayList;

class Playlist {
  String name;

  public Playlist(String playlistName){
    name = playlistName;
  }
  
  public static void main(String[] args) {
    Playlist dance = new Playlist("Dance");
    System.out.println(dance.name);

    //initialize array of strings
    ArrayList<String> desertIslandPlaylist = new ArrayList<String>();

    //add songs to the playlist array
    desertIslandPlaylist.add("Islands in the Stream");
    desertIslandPlaylist.add("Don't Stop Till You Get Enough");
    desertIslandPlaylist.add("I Miss My Mom");
    desertIslandPlaylist.add("A Horse With No Name");
    desertIslandPlaylist.add("Killing Me Softly");
    desertIslandPlaylist.add("Jesus Take The Wheel");


    System.out.println(desertIslandPlaylist);
    System.out.println(desertIslandPlaylist.size());
    desertIslandPlaylist.remove("Jesus Take The Wheel");
    System.out.println(desertIslandPlaylist.size());
    System.out.println(desertIslandPlaylist);

    // swap first and second song order
    System.out.println("BEFORE SWAP: " + desertIslandPlaylist);
    String tempA = desertIslandPlaylist.get(0);
    desertIslandPlaylist.set(0, desertIslandPlaylist.get(1));
    desertIslandPlaylist.set(1, tempA);
    System.out.println("AFTER SWAP: " + desertIslandPlaylist);
  }
}