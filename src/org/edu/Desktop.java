package org.edu;

public class Desktop implements Hardware,Software {
	@Override
	public void softwareResources() {
		System.out.println("Software");
		
	}

	@Override
	
	public void hardwareResources() {
		System.out.println("hardware");
		
		
	}
	public void desktopModel()
	{
		System.out.println("desktop");
		
	}
	


	public static void main(String[] args) {
		Desktop d=new Desktop();
		d.hardwareResources();
		d.softwareResources();
		d.desktopModel();
		


}

	
}
