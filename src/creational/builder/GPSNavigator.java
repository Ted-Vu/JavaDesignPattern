package creational.builder;

public class GPSNavigator {
	public String route;

	public GPSNavigator() {
		// set default route
		route = "Saigon";
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getRoute() {
		return route;
	}
}
