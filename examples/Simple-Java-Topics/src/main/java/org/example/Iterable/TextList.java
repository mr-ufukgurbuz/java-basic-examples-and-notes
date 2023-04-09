package org.example.Iterable;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class TextList implements Iterable<String> {

    private LinkedList<String> textList = new LinkedList<String>();

    private class TextIterator implements Iterator<String> {

        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < textList.size();
        }

        @Override
        public String next() {
            StringBuilder sb = new StringBuilder();

            try {
                URL url = new URL(textList.get(index));

                BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));

                String line = null;

                while ((line = br.readLine()) != null){
                    sb.append(line);
                    sb.append("\n");
                }
                br.close();
            }  catch (Exception e) {
                e.printStackTrace();
            }
            index++;

            return sb.toString();
        }

        @Override
        public void remove() {
            textList.remove(index);
        }
    }

    public TextList(){
        textList.add("deneme123");
        textList.add("deneme1234");
        textList.add("deneme12345");
    }

    @Override
    public Iterator<String> iterator() {
        return new TextIterator();
    }

}
