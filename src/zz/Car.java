package zz;

public class Car extends Phuongtien implements ICar {
	public Car(String iD, String hangSx, int namSX, double giaBan, String mauXe, int soChongoi, String soDongCo) {
		super(iD, hangSx, namSX, giaBan, mauXe);
		this.setSoChongoi(soChongoi);
		this.setSoDongCo(soDongCo);
	}

	// TODO Auto-generated constructor stub
	private int soChongoi;
	private String soDongCo;

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Car [soChongoi=" + soChongoi + ", soDongCo=" + soDongCo + "]";
	}

	public int getSoChongoi() {
		return soChongoi;
	}

	public void setSoChongoi(int soChongoi) {
		this.soChongoi = soChongoi;
	}

	public String getSoDongCo() {
		return soDongCo;
	}

	public void setSoDongCo(String soDongCo) {
		this.soDongCo = soDongCo;
	}

	@Override
	public void showInfor() {
		// TODO Auto-generated method stub

	}

}
