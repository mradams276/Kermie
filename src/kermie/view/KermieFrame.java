package kermie.view;
import javax.swing.JFrame;


public class KermieFrame extends JFrame
{
	private KermiePanel appPanel;
	private KermieController baseController;
	
	public KermieFrame(KermieController baseController);
	{
		super();
		this.baseController = baseController;
		this.appPanel = new KermiePanel(baseController);
		
		setupFrame();
	}
	
	
	
	
}
