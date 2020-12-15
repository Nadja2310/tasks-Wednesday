package de.telran;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class PatternString {


   public boolean searchPattern(String text,String pattern){
        List<Character> list = text.chars().mapToObj((i) -> (char) i).collect(Collectors.toList());
        Deque<Character> dequeText = new LinkedList<Character>(list);

        List<Character> listPattern = pattern.chars().mapToObj((i) -> (char) i).collect(Collectors.toList());
        Deque<Character> dequePattern = new LinkedList<Character>(listPattern);

        return recursiveString(dequeText,dequePattern);
    }

    private boolean recursiveString(Deque<Character> dequeText,Deque<Character> dequePattern){
        if (dequeText.size()<dequePattern.size())
            return false;
        if (dequePattern.size()==0)
            return true;
        if (dequeText.getLast()==dequePattern.getLast()){
            dequeText.removeLast();
            dequePattern.removeLast();
            return recursiveString(dequeText,dequePattern);
        }

        if (dequeText.getLast()!=dequePattern.getLast()) {
            dequeText.removeLast();
            return recursiveString(dequeText, dequePattern);
        }
        return false;
    }
}
