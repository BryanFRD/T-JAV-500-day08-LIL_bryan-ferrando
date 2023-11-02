package Composite;

import java.util.List;

public class SentenceComposite implements Sentence {

    private List<Sentence> childSentence;

    public void add(Sentence sentence){
        childSentence.add(sentence);
    }

    public void print(){
        childSentence.forEach(Sentence::print);
    }

}
