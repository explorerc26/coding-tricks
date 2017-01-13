package com.explorer.graph;

import java.math.BigDecimal;
import java.util.Date;

public class Sample {
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + a;
		result = prime * result + ((aa == null) ? 0 : aa.hashCode());
		result = prime * result + b;
		result = prime * result + Float.floatToIntBits(c);
		long temp;
		temp = Double.doubleToLongBits(d);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((money == null) ? 0 : money.hashCode());
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
		Sample other = (Sample) obj;
		if (a != other.a)
			return false;
		if (aa == null) {
			if (other.aa != null)
				return false;
		} else if (!aa.equals(other.aa))
			return false;
		if (b != other.b)
			return false;
		if (Float.floatToIntBits(c) != Float.floatToIntBits(other.c))
			return false;
		if (Double.doubleToLongBits(d) != Double.doubleToLongBits(other.d))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (money == null) {
			if (other.money != null)
				return false;
		} else if (!money.equals(other.money))
			return false;
		return true;
	}
	int a; 
	String aa ; 
	int b ; 
	float c; 
	double d; 
	Date date;
	BigDecimal money;
}
