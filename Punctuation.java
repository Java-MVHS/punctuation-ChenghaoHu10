/* Chenghao Hu
 * Period 7
 * 12/12/2024
 * Punctuation.java
 * This program takes a paragraph of text, then it removes all the words that are
 * not connected with a comma, period, or other form of punctuation. It keeps all 
 * the other words. 
 * 
 */

public class Punctuation
{
	public static void main (String[] args)
	{
		Punctuation pun = new Punctuation(); //Creates a new instance of Punctuation
		pun.SearchIt(); // Run the SearchIt method
	}
	
	public void SearchIt()
	{
		String stringer = getPunctuationWords(); // Set the result returned from our getPunctuationWords method as a string
		printWords(stringer); //print stringer for our final output on the user's end. 
	}
	
	public String getPunctuationWords()
	{
		String str = new String("On Friday evening last I received His Majesty's commission to form a new " +
		"Administration. It was the evident wish and will of Parliament and the " +
		"nation should be conceived on the broadest possible basis and that it should " +
		"include all parties, both those who supported the late Government and also the parties " +
		"of the Opposition. " +
		"I have completed the most important part of this task. A War Cabinet has " +
		"been formed of five Members, representing, with the Liberal Opposition, the unity of the " +
		"nation. The three party Leaders have agreed to serve, either in the War Cabinet or in "+
		"high executive office. The three Fighting Services have been filled. It was necessary " +
		"that this should be done in one single day, on account of the extreme urgency and " +
		"rigour of events. A number of other key positions were filled yesterday, and I am " +
		"submitting a further list to His Majesty tonight. I hope to complete the appointment of the " +
		"principal Ministers during tomorrow. The appointment of the other Ministers usually " +
		"takes a little longer, but I trust that, when Parliament meets again, this part of my task " +
		"will be completed, and that the Administration will be complete in all respects." +
		"Sir, I considered it in the public interest to suggest that the House should " +
		"be summoned to meet today. Mr. Speaker agreed and took the necessary steps, in " +
		"accordance with the powers conferred upon him by the Resolution of the House. At the " +
		"end of the proceedings today, the Adjournment of the House will be proposed until " +
		"Tuesday, the 21st May, with, of course, provision for earlier meeting, if need be. The " +
		"business to be considered during that week will be notified to Members at the earliest " +
		"opportunity. I now invite the House, by the Resolution which stands in my name, to " +
		"record its approval of the steps taken and to declare its confidence in the  Government. " +
		"Sir, to form an Administration of this scale and complexity is a serious " +
		"undertaking in itself, but it must be remembered that we are in the preliminary stage of " +
		"one of the greatest battles in history, that we are in action at many points in Norway and " +
		"in Holland, that we have to be prepared in the Mediterranean, that the air battle is " +
		"continuous and that many preparations have to be made here at home. In this crisis I " +
		"hope I may be pardoned if I do not address the House at any length today. I hope that " +
		"any of my friends and colleagues, or former colleagues, who are affected by the political " +
		"reconstruction, will make all allowances for any lack of ceremony with which it has been " +
		"necessary to act. I would say to the House, as I said to those who’ve joined this " +
		"government: I have nothing to offer but blood, toil, tears and sweat. " +
		"We have before us an ordeal of the most grievous kind. We have before " +
		"us many, many long months of struggle and of suffering. You ask, what is our policy? I " +
		"will say: It is to wage war, by sea, land and air, with all our might and with all the " +
		"strength that God can give us; to wage war against a monstrous tyranny, never " +
		"surpassed in the dark and lamentable catalogue of human crime. That is our policy. You " +
		"ask, what is our aim? I can answer in one word: victory. Victory at all costs, victory in " +
		"spite of all terror, victory, however long and hard the road may be; for without victory, " +
		"there is no survival. Let that be realised; no survival for the British Empire, no survival " +
		"for all that the British Empire has stood for, no survival for the urge and impulse of the " +
		"ages, that mankind will move forward towards its goal. " +
		"But I take up my task with buoyancy and hope. I feel sure that our cause " +
		"will not be suffered to fail among men. At this time I feel entitled to claim the aid of all, " +
		"and I say, Come then, let us go forward together with our united strength. "); 
		
		String stri = checkForPunctuation(str); //applies the checkForPunctuation method that gives us a string for results. 
		
		return stri;
	}
	
	public String checkForPunctuation(String strIn)
	{
		String strin = new String("");
		String stride = new String("");
		int index = 0; //Establishes a int called index that counts the characters that we work on. 
		for(index = 0; index < strIn.length(); index++)
		{
			strin = strin + strIn.charAt(index);
			char cha = strIn.charAt(index);
			if(cha == ' ')
			{
				strin = "";
			} // Doesn't add the word into our final string if it ends with a space
			
			else 
			{
				if(checker(cha) == true)
				{
					if((index == strIn.length()-1) || (index+1 < strIn.length() && strIn.charAt(index+1) == ' '))  //Skip words with punctuation in them. 
					{
						stride = stride + strin; 
						strin = "";
					}// Adds the words which end with a punctuation before a space into our final string.
				}
			}
		}
		return stride;  //Produce our final string output. 
	}
	
	public boolean checker(char ball)     //Check if the char is a punctuation
	{
		boolean che = true;
		if (33 <= (int)(ball) && (int)(ball) <= 47 || 58 <= (int)(ball) && (int)(ball) <= 64 || 91 <= (int)(ball) && (int)(ball)<= 96)
		{
			che = true; // Returns a true values if your char is a punctuation. 
		}
		
		else
		{
			che = false; //Returns a false value if your char is not a punctuation
		}
		return che;
	}
	
	public void printWords(String striIn) //method that prints our result string. 
	{
		System.out.println("\n\n\n");
		System.out.print(striIn);
		System.out.println("\n\n\n");
	}
	
}
