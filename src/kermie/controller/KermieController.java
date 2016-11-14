package kermie.controller;

import kermie.model.Kermie;

public class KermieController
{
	private String [] words = {"this", "is", "the", "next", "level", "of", "trash", "the", "initialization", "sequence"};
	private Kermie [] kermie;
	private int [] numbers;
	private KermieFrame appFrame;
	
	public KermieController()
	{
		showHipsterLevelThree();
		kermie = new Kermie [5];
		appFrame = new KermieFrame(this);
		
		for(int index = 0; index < kermie.length; index++)
		{
			kermie[index] = new Kermie("Kermie #" + index);
		}
		
	}
	
	
	public void start()
	{
		for(Kermie current : kermie)
		{
			System.out.println(current);
		}
}

	private void showHipsterLevelThree()
	{
		numbers = new int [] {1,2,3,4,5,6,7,8,9,0,9,8,7,6,5,4,3,2,1};
	}
	public Kermie[] getKermie()
	{
		return kermie;
	}
	
	public String[] getWords()
	{
		return words;
	}
	public int[] getNumbers()
	{
		return numbers;
	}
}