package com.company;

import java.util.*;

public class Main {

    private static ArrayList<Album> albums = new ArrayList<Album>();

    public static void main(String[] args) {
	// write your code here
        Album album = new Album("Stormbringer","Deep Purple");
        album.addSong("Stormbringer",4.6);
        album.addSong("Love don't mean a thing",4.22);
        album.addSong("Holy Man",4.3);
        album.addSong("Hold On",5.6);
        album.addSong("Lady double dealer",3.21);
        album.addSong("YOu can't do it right",6.23);
        album.addSong("High Ball shooter",4.27);
        album.addSong("The gypsy",4.2);
        album.addSong("Soldier of Fortune",3.13);
        albums.add(album);

        album = new Album("For those about to rock","AC/DC");
        album.addSong("For those about to rock",5.44);
        album.addSong("Kal ho na ho",3.25);
        album.addSong("Blah",3.45);
        album.addSong("Fetish",3.33);
        album.addSong("Rock on",4.51);
        album.addSong("In the end",3.45);
        album.addSong("Numb",5.25);
        album.addSong("Crawling",5.32);
        album.addSong("Castle of glass",5.12);
        albums.add(album);

        LinkedList<Song> playList = new LinkedList<Song>();
        albums.get(0).addToPlayList("Soldier of Fortune",playList);
        albums.get(0).addToPlayList("The gypsy",playList);
        albums.get(0).addToPlayList("speaking",playList); //Does not exist
        albums.get(0).addToPlayList(9,playList);
        albums.get(1).addToPlayList(8,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(24,playList); //This should fail

        play(playList);

    }

    private static void play(LinkedList<Song> playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean forward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size()==0){
            System.out.println("No songs in playList");
            return;
        }else{
            System.out.println("Now playing "+ listIterator.next().toString());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch(action){
                case 0:
                    System.out.println("Playlist complete");
                    quit=true;
                    break;
                case 1:
                    if(!forward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        forward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of the playlist");
                        forward=false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+ listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the playlist");
                        forward=true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now Replaying " + listIterator.previous().toString());
                            forward=false;
                        }else{
                            System.out.println("We are at the start of the list");
                        }
                    }else {
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying "+listIterator.next().toString());
                            forward=true;
                        }else{
                            System.out.println("we have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6: if(playList.size()>0){
                    listIterator.remove();
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+listIterator.next());
                    }else if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+listIterator.previous());
                    }
                }
                break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions");
    }

    private static void printList(LinkedList<Song> playList){
        Iterator<Song> iterator = playList.iterator();
        System.out.println("===================");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
        System.out.println("====================");
    }
    

}
