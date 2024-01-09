package StarWar_1111410002;

import java.util.Arrays;

class TieFighter extends AirCraft{
	String Manufacturer="Sienar Fleet Systems";
	String Model="Twin Ion Engine Line Starfighter";
	double Length=6.3;
	double AirSpeed=1200;
	String SpaceSpeed=("4100G");
	String StdandardEngine ="SFS P-s4 雙離子引擎";
	String HyperSpaceEngine ="無";
	String[] Weapon= {"SFS L-s1 型雷射加農炮"," SFS L-s1 型雷射加農炮"};
	Double[] Weapon_power={1000.0,1000.0};
	int Passenger =0;
	String[] Shield = {"無護盾（升級版可選）"};
	double[] ShieldPower = {};
	public String getManufacturer() {
		return Manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		Manufacturer = manufacturer;
	}
	public String getModel() {
		return Model;
	}
	public void setModel(String model) {
		Model = model;
	}
	public double getLength() {
		return Length;
	}
	public void setLength(double length) {
		Length = length;
	}
	public double getAirSpeed() {
		return AirSpeed;
	}
	public void setAirSpeed(double airSpeed) {
		AirSpeed = airSpeed;
	}
	public String getSpaceSpeed() {
		return SpaceSpeed;
	}
	public void setSpaceSpeed(String spaceSpeed) {
		SpaceSpeed = spaceSpeed;
	}
	public String getStdandardEngine() {
		return StdandardEngine;
	}
	public void setStdandardEngine(String stdandardEngine) {
		StdandardEngine = stdandardEngine;
	}
	public String getHyperSpaceEngine() {
		return HyperSpaceEngine;
	}
	public void setHyperSpaceEngine(String hyperSpaceEngine) {
		HyperSpaceEngine = hyperSpaceEngine;
	}
	public String[] getWeapon() {
		return Weapon;
	}
	public void setWeapon(String[] weapon) {
		Weapon = weapon;
	}
	public Double[] getWeapon_power() {
		return Weapon_power;
	}
	public void setWeapon_power(Double[] weapon_power) {
		Weapon_power = weapon_power;
	}
	public int getPassenger() {
		return Passenger;
	}
	public void setPassenger(int passenger) {
		Passenger = passenger;
	}
	public String[] getShield() {
		return Shield;
	}
	public void setShield(String[] shield) {
		Shield = shield;
	}
	public double[] getShieldPower() {
		return ShieldPower;
	}
	public void setShieldPower(double[] shieldPower) {
		ShieldPower = shieldPower;
	}
	@Override
	public String toString() {
		return "TieFighter [Manufacturer=" + Manufacturer + ", Model=" + Model + ", Length=" + Length + ", AirSpeed="
				+ AirSpeed + ", SpaceSpeed=" + SpaceSpeed + ", StdandardEngine=" + StdandardEngine
				+ ", HyperSpaceEngine=" + HyperSpaceEngine + ", Weapon=" + Arrays.toString(Weapon) + ", Weapon_power="
				+ Arrays.toString(Weapon_power) + ", Passenger=" + Passenger + ", Shield=" + Arrays.toString(Shield)
				+ ", ShieldPower=" + Arrays.toString(ShieldPower) + "]";
	}
	
}