package ie.dit;
 
public class Match implements Comparable
{
	public float ed;
	public String word;

	Match(String word, float ed)
	{
		this.ed = ed;
		this.word = word;
	}

	public int compareTo(Object m)
	{
		//return (int) (ed - ((Match)m).ed);
		Match mm = (Match) m;
		System.out.println("Comparing: " + word + " with: " + mm.word);
		return (int) (ed - mm.ed);
	}
}