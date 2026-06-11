package mainPackage;

public class Camera {
	private double zoomLevel;

	public void takePhoto() {
		System.out.println("Photo taken!");
	}

	public void deletePhoto() {
		System.out.println("Photo deleted!");
	}

	public double getZoomLevel() {
		return zoomLevel;
	}

	public void setZoomLevel(double zoomLevel) {
		this.zoomLevel = zoomLevel;
	}

}
