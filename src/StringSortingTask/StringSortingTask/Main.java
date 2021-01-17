package StringSortingTask;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String string = "London is the capital of Great Britain, its political, economic and cultural centre. " +
        "It's one of the largest cities in the world. Its population is more than million people. " +
                "London is situated on the river Thames. The city is very old and beautiful. " +
                "It was founded more than two thousand years ago. Traditionally London is divided into several " +
                "parts: the City, the West End, the East End and Westminster. The City is the oldest part of " +
                "London, its financial and business centre. The heart of the City is the Stock Exchange. " +
                "Westminster is the most important part of the capital. It's the administrative centre. " +
                "The Houses of Parliament, the seat of the British Government, are there. It's a very beautiful " +
                "building with two towers and a very big clock called Big Ben. Big Ben is really the bell which " +
                "strikes every quarter of an hour. Opposite the Houses of Parliament is Westminster Abbey. " +
                "It's a very beautiful church built over 900 years ago. The tombs of many great statesmen, " +
                "scientists and writers are there. To the west of Westminster is West End. Here we find most " +
                "of the big shops, hotels, museums, art galleries, theatres and concert halls. Picadilly " +
                "Circus is the heart of London's West End. In the West End there are wide streets with " +
                "beautiful houses and many parks, gardens and squares. To the east of Westminster is the " +
                "East End, an industrial district of the capital. There are no parks or gardens in the " +
                "East End and you can't see many fine houses there. Most of the plants and factories " +
                "are situated there. London has many places of interest. One of them is Buckingham Palace. " +
                "It's the residence of the Queen. The English are proud of Trafalgar Square, which was named " +
                "so in memory of the victory at the battle. There in 1805 the English fleet defeated the " +
                "fleet of France and Spain. The last place of interest I should like to mention, is the " +
                "British Museum, the biggest museum in London. The museum is famous for its library -one " +
                "of the richest in the world. All London's long-past history is told " +
                "by its streets. There are many streets in London which are known all over the world. " +
                "Among them Oxford Street, Downing Street and a lot of others can be mentioned. " +
                "And tourists are usually attracted not only by the places of interest but by the streets too. " +
                "In conclusion I should say if you are lucky enough to find yourself in London some day you will " +
                "have a lot to see and enjoy there.";

        WordCount wordCount = new WordCount(string);
       // System.out.println(Arrays.toString(wordCount.getSortedArrayAlphabetically(string)));
        wordCount.getNumberWordsInAlphabeticalOrder(string);
    }
}
