package StarWar_1111410002;

public class XWing extends AirCraft{
	
	String Manufacturer=" ";
	String Model="Incom Corporation T-65B X-Wing Space Superiority Fighter";
	double Length=12.5;
	double AirSpeed=1050;
	String SpaceSpeed=("100MGL");
	String StdandardEngine ="80MGLT";
	String HyperSpaceEngine ="Class 1 Koensayr R300-H 之超空間飛行引擎";
	String[] Weapon= {"Taim & Bak KX9 雷射加農炮"," Taim & Bak KX9 雷射加農炮",
			"Taim & Bak KX9 雷射加農炮"," Taim & Bak KX9 雷射加農炮",
			"Krupx MG7 質子魚雷發射器"," Krupx MG7 質子魚雷發射器"};
	Double[] Weapon_power={1000.0,1000.0,1000.0,1000.0,5.0,5.0};
	int Passenger =2;
	String[] Shield = {"Defender"+"Deflector-Screen Projector",
			"Deflector Shield Projector",
			"鈦合金加勁外殼"};
	double[] ShieldPower = {2000.0,3000.0,1000.0};
	protected double RemainShieldPower =
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
public XWing() {}
public XWing(String Manufacturer,String Model,double Length,double AirSpeed,String SpaceSpeed,String StdandardEngine) { 
	this.set_CourseName(_CourseName);
	this.set_CourseCredit(_CourseCredit);
	this.setTea01(tea01);
}
	@Override
	public String toString() {
		return "XWing [Manufacturer=" + Manufacturer + ", Model=" + Model + ", Length=" + Length + ", AirSpeed="
				+ AirSpeed + ", SpaceSpeed=" + SpaceSpeed + ", StdandardEngine=" + StdandardEngine
				+ ", HyperSpaceEngine=" + HyperSpaceEngine + ", Weapon=" + Arrays.toString(Weapon) + ", Weapon_power="
				+ Arrays.toString(Weapon_power) + ", Passenger=" + Passenger + ", Shield=" + Arrays.toString(Shield)
				+ ", ShieldPower=" + Arrays.toString(ShieldPower) + "]";
	}
}
