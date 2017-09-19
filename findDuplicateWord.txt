
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class FindDW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String iString="IN MOST RECENT trailer for Thor: Ragnarok, it seems clear that Thor teams up with The Hulk, "
				+ "Loki, and Valkyrie—but for me, I'm mostly pumped up about seeing The Hulk again. Towards the end of the trailer, "
				+ "The Hulk is standing with the rest of The Revengers team (the name Thor comes up with on the spot)"
				+ "But there's something funny about this trailer: To me, it seems like The Hulk is much bigger in Thor: R"
				+ "agnarok than in the previous Marvel movies. I'm what you might call an expert in Hulk heights; "
				+ "I've estimated his size before, like when I used it to get a value for his mass when looking at the force he "
				+ "exerts on the ground during a jump. In the Marvel Cinematic Universe (the Marvel movies that started with "
				+ "Iron Man in 2008 and continues through today), The Hulk has appeared three times with one more coming in the "
				+ "movie Thor: Ragnarok, out on October 25. So of course this means I need to go back and measure "
				+ "his size in each of the previous appearances—just to make sure.How do you find the height of a fictional character?"
				+ " Yes, I am well aware that The Hulk is not real. "
				+ "However, that doesn't stop me from trying to apply some cool physics to these make believe characters. "
				+ "In short, the best way to measure The Hulk's size is to find a frame where he's standing next to "
				+ "some real object of known height. This object could be another character played by a real human (like "
				+ "Chris Hemsworth who plays Thor) or something else real like a car.After I find some particular scene that can be used to estimate "
				+ "The Hulk's height, I will just use that known object to set the scale of the scene and then boom—I have the height of The Hulk."
				+ " You could of course do this with any drawing program, but I find it's easiest just to use the free Tracker Video Analysis program,"
				+ " since it has that functionality built in.In many cases, The Hulk isn't standing up straight, "
				+ "but I can still get an estimate for his height by either approximating how far he would stretch while standing "
				+ "or by summing the measurements from legs to torso to head. Both are still just approximations, "
				+ "but they're better than nothing.Since I am dealing with approximations, I am also going to estimate the uncertainty in these measurements."
				+ " If I write a height of 2.1 +/- 0.1 meters, that means the true value of the height is most likely between 2.0 meters "
				+ "and 2.2 meters. Again, I get these uncertainty values just by using my own best judgement.Now for the data—you've waited long enough."
				+ " I should have four values for The Hulk's height (from the four Marvel movies), "
				+ "but I am going to give you six. The other two are from the Universal Pictures "
				+ "Hulk movie in 2003 starring Eric Bana and The Hulk television show with Lou Ferrigno (from the 70's). "
				+ "Yes, know these aren't in the Marvel Cinematic Universe, but you can't really stop me.Here is my plot. "
				+ "I've included error bars to represent the uncertainties and each height has a time value corresponding to"
				+ " the year of the movie (or show).It seems like I was wrong. This is what happens when you get too excited about a "
				+ "movie and make a crazy claim without checking the data (always check the data). The Hulk is not significantly different in "
				+ "Thor: Ragnarok than in the previous MCU movies. Notice that by fitting a linear function to the last four data points "
				+ "it's clear that the values with uncertainties covers an average height of around 2.6 meters. Of course The Hulk from "
				+ "the 2003 movie is indeed quite a bit larger than in the MCU and the Lou Ferrigno Hulk is the size of Lou."
				+ "But why was I wrong? Look at the trailer for Thor: Ragnarok. In that clip, there is scene with The Hulk "
				+ "standing upright and right next to Thor. This means two things. First, he is not hunched over, "
				+ "so it's easier to get a height measurement. Second, he is right next to a known object (Thor) and this produces "
				+ "a smaller uncertainty. The Hulk isn't just a completely fictional object—he is actual some digital object in a "
				+ "computer. If he did all of a sudden change size, that would be kind of weird.";
		
		
		
		Set<String> duplicateWords=findDuplicateWord(iString);
		System.out.println(duplicateWords);
		String [] st=new String[duplicateWords.size()];
		duplicateWords.toArray(st);
		System.out.println(st[0]);
		System.out.println(st[1]);
		System.out.println(st[2]);
		System.out.println(st[3]);
		System.out.println(st[4]);

	}

	
	
	
	private static Set<String> findDuplicateWord(String iString) {
		if(iString == null || iString.isEmpty()){
			return Collections.emptySet();
		}else{
			Set<String> duplicateWords=new HashSet<String>();
			iString = iString.replace("\"", "").replace("'", "").replace("-", " ").replace("\\n", " ").replace(".", " ").replace(",", " ").replace(";", " ").replace(":", " ").toLowerCase();
			String [] words=iString.split("\\s+");
			Set<String> set=new HashSet<String>();
			for(String word:words){
				if(!set.add(word)){
					
					duplicateWords.add(word);
				}
			}
			return duplicateWords;
			
		}
		
	}
}