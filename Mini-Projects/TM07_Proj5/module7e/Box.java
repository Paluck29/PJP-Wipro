package module7e;

public class Box {
	Double length;
	Double width;
	Double height;
	
	Box(){	}
	
	public void setLength(Double l) {
		this.length = l;
	}
	
	public Double getLength() {
		return this.length;
	}
	
	public void setWidth(Double w) {
		this.width = w;
	}
	
	public Double getWidth() {
		return this.width;
	}
	
	public void setHeight(Double h) {
		this.height = h;
	}
	
	public Double getHeight() {
		return this.height;
	}
	
	public Double getVolume() {
		return this.length * this.width * this.height;
	}

	@Override
	public int hashCode() {
		
		String str = String.valueOf(getVolume());
		return str.hashCode();
				
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Box other = (Box) obj;
		
		if (this.getVolume() == null) {
			if (other.getVolume() != null)
				return false;
		} else if (!(this.getVolume()).equals(other.getVolume()))
			return false;
		
		return true;
	}
	
	

}
