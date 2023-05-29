import java.io.FileInputStream;
import java.io.StreamTokenizer;

class StreamTokeniserDemo {
    

    public static void main(String[] args) throws Exception {
        
        FileInputStream fis=new FileInputStream("/Users/sanskaratrey/Documents/G6-Java/IOStream/sample.txt");

        StreamTokenizer streamTokeniser=new StreamTokenizer(fis);


        int x=streamTokeniser.nextToken();

        // System.out.println(x==StreamTokenizer.TT_WORD);


        while(x!=StreamTokenizer.TT_EOF)c
        {

            if(x==StreamTokenizer.TT_WORD)
            System.out.println(streamTokeniser.sval);

            else if(x==StreamTokenizer.TT_NUMBER)
            System.out.println(streamTokeniser.nval);


            x=streamTokeniser.nextToken();
        }


    }
}
