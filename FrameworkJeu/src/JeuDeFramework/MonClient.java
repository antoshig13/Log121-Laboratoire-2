package JeuDeFramework;

public class MonClient {
	public static void imprimer(Iterable unIterable)
	{
		Iterator i = unIterable.creerIterateur();
		while (i.hasNext()) {
			System.out.println(i.next().toString());
		}
	}
}
