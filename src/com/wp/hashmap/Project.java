package com.wp.hashmap;


public class  Project {
	int pcode, duration;
	 @Override
	public String toString() {
		return "Project [pcode=" + pcode + ", duration=" + duration + ", ptitle=" + ptitle + ", clientName="
				+ clientName + "]";
	}

	String ptitle, clientName;

	public Project(int i, String title, int j, String cn) {
		 pcode = i;
		ptitle = title;
		duration = j;
		clientName = cn;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((clientName == null) ? 0 : clientName.hashCode());
		result = prime * result + duration;
		result = prime * result + pcode;
		result = prime * result + ((ptitle == null) ? 0 : ptitle.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Project other = (Project) obj;
		if (clientName == null) {
			if (other.clientName != null)
				return false;
		} else if (!clientName.equals(other.clientName))
			return false;
		if (duration != other.duration)
			return false;
		if (pcode != other.pcode)
			return false;
		if (ptitle == null) {
			if (other.ptitle != null)
				return false;
		} else if (!ptitle.equals(other.ptitle))
			return false;
		return true;
	}
	
	

}
