package langPeldak.harmas;

import java.awt.Color;

public class SzinesPont extends langPeldak.harmas.Pont {

	private final Color szin;

	public SzinesPont(int x, int y, Color szin) {
		super(x, y);
		this.szin = szin;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		//if (getClass() != obj.getClass())
		//	return false;
		if (!(obj instanceof SzinesPont))
			return false;
		SzinesPont other = (SzinesPont) obj;
		if (szin == null) {
			if (other.szin != null)
				return false;
		} else if (!szin.equals(other.szin))
			return false;
		return true;
	}	
	
}
