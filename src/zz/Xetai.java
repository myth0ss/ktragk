package zz;

public class Xetai extends Phuongtien implements ICar {
	private double trongTai;

	public Xetai(String iD, String hangSx, int namSX, double giaBan, String mauXe, double trongTai) {
		super(iD, hangSx, namSX, giaBan, mauXe);
		this.trongTai = trongTai;
	}

	public void Xetai1(String iD, String brand, int publishYear, double price, String color, double loadWeight) {
		// TODO Auto-generated constructor stub
	}

	public void Xetai11(String iD, String brand, int publishYear, double price, String color, double loadWeight) {
		// TODO Auto-generated constructor stub
	}

	public double getTrongTai() {
		return trongTai;
	}

	public void setTrongTai(double trongTai) {
		this.trongTai = trongTai;
	}

	@Override
	public String toString() {
		return "XeTai [trongTai=" + trongTai + "]";
	}

	@Override
	public void showInfor() {
		// TODO Auto-generated method stub
		System.out.println(toString());
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub
	}
}
