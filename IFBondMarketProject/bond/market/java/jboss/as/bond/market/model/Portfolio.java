package jboss.as.bond.market.model;

// Generated Mar 12, 2014 4:18:30 AM by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Portfolio generated by hbm2java
 */
@Entity
@Table(name = "Portfolio", catalog = "BondMarket")
public class Portfolio implements java.io.Serializable {

	private Integer id;
	private Investisor investisor;
	private Integer quantity;
	private Integer asset;

	public Portfolio() {
	}

	public Portfolio(Investisor investisor, Integer quantity, Integer asset) {
		this.investisor = investisor;
		this.quantity = quantity;
		this.asset = asset;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "owner")
	public Investisor getInvestisor() {
		return this.investisor;
	}

	public void setInvestisor(Investisor investisor) {
		this.investisor = investisor;
	}

	@Column(name = "quantity")
	public Integer getQuantity() {
		return this.quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Column(name = "asset")
	public Integer getAsset() {
		return this.asset;
	}

	public void setAsset(Integer asset) {
		this.asset = asset;
	}

}