import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class StringReaderDemo {

	public static void main(String[] args) {
		 simple();
		stringTokenizer();
	}

	public static void simple() {
		String s = "Hello World";

		// create a new StringReader
		StringReader sr = new StringReader(s);

		try {
			// check if reader is ready
			System.out.println("ready>" + sr.ready());

			// read the first five chars
			for (int i = 0; i < 6; i++) {
				char c = (char) sr.read();
				System.out.print("" + c);
			}

			// close the stream
			sr.close();

		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

	public static void stringTokenizer() {

		StreamTokenizer streamTokenizer,readstreamTokenizer = null;

		System.out.println("stringTokenizer example");

		String stringToBeParsed = "23123 The quick brown fox 23123 jumped The the 23123 The 1233434 dog";

		StringReader reader = new StringReader(stringToBeParsed);

		int wordCount = 0;
		int i = 0;
		int numberCount=0;

		try {

			streamTokenizer = new StreamTokenizer(reader);
			readstreamTokenizer = new StreamTokenizer(reader);

			/*
			 * Parses the next token from the input stream of this tokenizer.
			 * The type of the next token is returned in the ttype field.
			 * Additional information about the token may be in the nval field
			 * or the sval field of this tokenizer. Typical clients of this
			 * class first set up the syntax tables and then sit in a loop
			 * calling nextToken to parse successive tokens until TT_EOF is
			 * returned.
			 */

			while (streamTokenizer.nextToken() != StreamTokenizer.TT_EOF) {
				String temp = streamTokenizer.sval;
				double numTemp = streamTokenizer.nval;
				System.out.println(" temp == " + temp);
				while (readstreamTokenizer.nextToken() != StreamTokenizer.TT_EOF) {

					if (readstreamTokenizer.ttype == StreamTokenizer.TT_WORD) {
						/*System.out.println(" == in loop == "
								+ readstreamTokenizer.sval);*/
						if (temp.equals(readstreamTokenizer.sval)) {
							i++;
						}
					}
					
					if (readstreamTokenizer.ttype == StreamTokenizer.TT_WORD) {
						System.out.println(" == in loop == "
								+ readstreamTokenizer.nval);
						if (numTemp==readstreamTokenizer.nval) {
							numberCount++;
						}
					}
				}
				System.out.println("temp = " + temp + " == count == " + i);
				System.out.println("numTemp = " + numTemp + " == numberCount == " + numberCount);

			}

			System.out.println("Number of words in file: " + wordCount);

		} catch (FileNotFoundException ex) {
			ex.printStackTrace();
		} catch (IOException ex) {
			ex.printStackTrace();
		}
	}

}
