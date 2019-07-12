import java.io.IOException;
import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.apache.lucene.analysis.TokenFilter;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;

public class SolrFilterTest extends TokenFilter {
    private static final Logger logger = LogManager.getLogger(SolrFilterTest.class);

    private CharTermAttribute charTermAttr;

    protected SolrFilterTest(TokenStream ts) {
        super(ts);
        this.charTermAttr = addAttribute(CharTermAttribute.class);
    }

    @Override
    public boolean incrementToken() throws IOException {
        if (!input.incrementToken()) {
            return false;
        }


        char[] bufferInput = charTermAttr.buffer();

        String inputTerm= "";

        for(int b=0;b<bufferInput.length;b++){
            if (bufferInput[b]!= '\u0000'){
                inputTerm+= bufferInput[b];
            }
        }


        String stemmed_output = inputTerm;

        System.out.println("Buffeeered String" + inputTerm);

        if(inputTerm.length()>1) {

            System.out.println("INSIDEPAKAYAAAAAAAAAAAA:");

            if (inputTerm.substring(inputTerm.length() - 1).equals("ය")) {


                stemmed_output = inputTerm.replace("ය", "");
            }
        }
        if(inputTerm.length()>2) {
            if (inputTerm.substring(inputTerm.length() - 2).equals("යක")) {
                stemmed_output = inputTerm.replace("යක", "");
            }
            if(inputTerm.substring(inputTerm.length() - 2).equals("යට")) {
                stemmed_output = inputTerm.replace("යට", "");
            }
            if(inputTerm.substring(inputTerm.length() - 2).equals("වී")) {
                stemmed_output = inputTerm.replace("වී", "");
            }
            if(inputTerm.substring(inputTerm.length() - 2).equals("වේ")) {
                stemmed_output = inputTerm.replace("වේ", "");
            }
        }
        if(inputTerm.length()>3) {
            if (inputTerm.substring(inputTerm.length() - 3).equals("යකට")) {
                stemmed_output = inputTerm.replace("යකට", "");
            }
            if (inputTerm.substring(inputTerm.length() - 3).equals("යක්")) {
                stemmed_output = inputTerm.replace("යක්", "");
            }
        }
        if(inputTerm.length()>4) {
            if(inputTerm.substring(inputTerm.length() - 4).equals("යෙන්")) {
                stemmed_output = inputTerm.replace("යෙන්", "");
            }

        }
        if(inputTerm.length()>5) {
            if (inputTerm.substring(inputTerm.length() - 5).equals("යකින්")) {
                stemmed_output = inputTerm.replace("යකින්", "");
            }

            if (inputTerm.substring(inputTerm.length() - 5).equals("වලින්")) {
                stemmed_output = inputTerm.replace("වලින්", "");
            }
        }



        char[] buffer = stemmed_output.toCharArray();

        int length = buffer.length;

        char[] characters = new char[11];

        characters[0]='ශ';
        characters[1]='ණ';
        characters[2] = 'ළ';
        characters[3] ='ධ';
        characters[4] ='භ';
        characters[5] ='ඝ';

        characters[6]='ඨ';
        characters[7] = 'ඵ';
        characters[8] ='ඪ';
        characters[9] ='ඛ';
        characters[10] ='ඡ';


        char[] charactersNew = new char[11];

        charactersNew[0]='ස';
        charactersNew[1]='න';
        charactersNew[2]='ල';
        charactersNew[3] ='ද';
        charactersNew[4] = 'බ';
        charactersNew[5] = 'ග';

        charactersNew[6]='ට';
        charactersNew[7]='ප';
        charactersNew[8] ='ඩ';
        charactersNew[9] = 'ක';
        charactersNew[10] = 'ච';

        char[] newBuffer = buffer;

        for (int i = 0; i < length; i++) {
            for(int j=0 ; j< characters.length; j++){
                if(buffer[i]==characters[j]){
                    newBuffer[i] = charactersNew[j];
                }
                else{
                    newBuffer[i]= buffer[i];
                }
            }

        }
        charTermAttr.setEmpty();


        String finalWord = new String(newBuffer);

        charTermAttr.append(finalWord);
//        charTermAttr.copyBuffer(newBuffer, 0, newBuffer.length);
//        charTermAttr.resizeBuffer(4);



        return true;
    }

}
