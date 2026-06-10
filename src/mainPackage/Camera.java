package mainPackage;

public class Camera {
	private double zoomLevel;

	public void takePhoto() {
		System.out.println("Photo taken!");
	}

	public double getZoomLevel() {
		return zoomLevel;
	}

	public void setZoomLevel(double zoomLevel) {
		this.zoomLevel = zoomLevel;
	}

}
