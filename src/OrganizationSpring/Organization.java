package OrganizationSpring;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import Address.Address;

public class Organization {


	private String name;
	private Address address;
	private double marketValue;
	private String dateOfEst;
	private int empCount;
	Set<String> cities;	
	List<String> boardMembers;
	Map<String,String> projectManagers;	
	private Properties proxies;
	public Organization(String name, Address address, double marketValue, String dateOfEst, int empCount,
			Set<String> cities, List<String> boardMembers, Map<String, String> projectManagers, Properties proxies) {
		super();
		this.name = name;
		this.address = address;
		this.marketValue = marketValue;
		this.dateOfEst = dateOfEst;
		this.empCount = empCount;
		this.cities = cities;
		this.boardMembers = boardMembers;
		this.projectManagers = projectManagers;
		this.proxies = proxies;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((boardMembers == null) ? 0 : boardMembers.hashCode());
		result = prime * result + ((cities == null) ? 0 : cities.hashCode());
		result = prime * result + ((dateOfEst == null) ? 0 : dateOfEst.hashCode());
		result = prime * result + empCount;
		long temp;
		temp = Double.doubleToLongBits(marketValue);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((projectManagers == null) ? 0 : projectManagers.hashCode());
		result = prime * result + ((proxies == null) ? 0 : proxies.hashCode());
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
		Organization other = (Organization) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (boardMembers == null) {
			if (other.boardMembers != null)
				return false;
		} else if (!boardMembers.equals(other.boardMembers))
			return false;
		if (cities == null) {
			if (other.cities != null)
				return false;
		} else if (!cities.equals(other.cities))
			return false;
		if (dateOfEst == null) {
			if (other.dateOfEst != null)
				return false;
		} else if (!dateOfEst.equals(other.dateOfEst))
			return false;
		if (empCount != other.empCount)
			return false;
		if (Double.doubleToLongBits(marketValue) != Double.doubleToLongBits(other.marketValue))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (projectManagers == null) {
			if (other.projectManagers != null)
				return false;
		} else if (!projectManagers.equals(other.projectManagers))
			return false;
		if (proxies == null) {
			if (other.proxies != null)
				return false;
		} else if (!proxies.equals(other.proxies))
			return false;
		return true;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public double getMarketValue() {
		return marketValue;
	}
	public void setMarketValue(double marketValue) {
		this.marketValue = marketValue;
	}
	public String getDateOfEst() {
		return dateOfEst;
	}
	public void setDateOfEst(String dateOfEst) {
		this.dateOfEst = dateOfEst;
	}
	public int getEmpCount() {
		return empCount;
	}
	public void setEmpCount(int empCount) {
		this.empCount = empCount;
	}
	public Set<String> getCities() {
		return cities;
	}
	public void setCities(Set<String> cities) {
		this.cities = cities;
	}
	public List<String> getBoardMembers() {
		return boardMembers;
	}
	public void setBoardMembers(List<String> boardMembers) {
		this.boardMembers = boardMembers;
	}
	public Map<String, String> getProjectManagers() {
		return projectManagers;
	}
	public void setProjectManagers(Map<String, String> projectManagers) {
		this.projectManagers = projectManagers;
	}
	public Properties getProxies() {
		return proxies;
	}
	public void setProxies(Properties proxies) {
		this.proxies = proxies;
	}
	@Override
	public String toString() {
		return "Organization [name=" + name + ", address=" + address + ", marketValue=" + marketValue + ", dateOfEst="
				+ dateOfEst + ", empCount=" + empCount + ", cities=" + cities + ", boardMembers=" + boardMembers
				+ ", projectManagers=" + projectManagers + ", proxies=" + proxies + "]";
	}

	
}