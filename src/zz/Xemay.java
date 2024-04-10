package zz;

public class Xemay extends Phuongtien implements ICar {
	private long CongSuat;

	public Xemay(String id2, String hangSx, int namSX, double giaBan, String mauXe, long congSuat) {
		super(id2, hangSx, namSX, giaBan, mauXe);
		this.CongSuat = congSuat;
	}

	public long getCongSuat() {
		return CongSuat;
	}

	public void setCongSuat(long congSuat) {
		CongSuat = congSuat;
	}

	@Override
	public void showInfo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void showInfor() {
		// TODO Auto-generated method stub

	}

}
