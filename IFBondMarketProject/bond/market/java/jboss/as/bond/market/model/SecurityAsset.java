package jboss.as.bond.market.model;

// Generated Mar 12, 2014 4:18:30 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * SecurityAsset generated by hbm2java
 */
@Entity
@Table(name = "SecurityAsset", catalog = "BondMarket")
public class SecurityAsset implements java.io.Serializable {

	private int id;
	private Company company;
	private Float strike;
	private String information;

	public SecurityAsset() {
	}

	public SecurityAsset(int id) {
		this.id = id;
	}

	public SecurityAsset(int id, Company company, Float strike,
			String information) {
		this.id = id;
		this.company = company;
		this.strike = strike;
		this.information = information;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "company")
	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	@Column(name = "strike", precision = 12, scale = 0)
	public Float getStrike() {
		return this.strike;
	}

	public void setStrike(Float strike) {
		this.strike = strike;
	}

	@Column(name = "information")
	public String getInformation() {
		return this.information;
	}

	public void setInformation(String information) {
		this.information = information;
	}

}
