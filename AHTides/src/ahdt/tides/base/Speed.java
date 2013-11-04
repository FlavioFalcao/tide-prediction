/*    
    Copyright (C) 1997  David Flater.
    Java port Copyright (C) 2011 Chas Douglass

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

//package net.floogle.jTide;
package ahdt.tides.base;

/**
 * 
 * @author chas
 */
public class Speed
{

	private double radiansPerSecond;

	public Speed(Speed speed)
	{
		this.radiansPerSecond = speed.getRadiansPerSecond();
	}

	public Speed(double degreesPerHour)
	{
		this.radiansPerSecond = degreesPerHour * Math.PI / 648000.0;
	}

	public double getRadiansPerSecond()
	{
		return radiansPerSecond;
	}

}
