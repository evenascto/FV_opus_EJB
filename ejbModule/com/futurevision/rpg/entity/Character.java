package com.futurevision.rpg.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * The persistent class for the "CHARACTER" database table.
 * 
 */
/**
 * @author veronezi
 * 
 */
@Entity
@Table(name = "GAME_CHARACTER")
@SequenceGenerator(name = "GAME_CHARACTER_ID_GENERATOR", sequenceName = "SEQ_GAME_CHARACTER")
public class Character implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "GAME_CHARACTER_ID_GENERATOR")
	@Column(name = "COD_CHA")
	private int id;

	@Lob
	@Column(name = "AUDIO_NAME")
	private Byte[] audioName;

	@Lob
	private Byte[] img;

	private String name;

	private Long xp;

	private Attribute luck;

	private Attribute life;

	private Attribute dexterity;

	@ManyToOne
	@JoinColumn(name = "COD_GAM_USE")
	private GameUser gameUser;

	@OneToMany
	@JoinColumn(name = "COD_CHA_ITE")
	private List<ChaIte> chaItes;

	private Vestment vestiment;

	@Transient
	private boolean alive;

	public Character() {
		this.alive = true;
	}

	public Byte[] getAudioName() {
		return audioName;
	}

	public void setAudioName(Byte[] audioName) {
		this.audioName = audioName;
	}

	public Byte[] getImg() {
		return img;
	}

	public void setImg(Byte[] img) {
		this.img = img;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getXp() {
		return xp;
	}

	public void setXp(Long xp) {
		this.xp = xp;
	}

	public Attribute getLuck() {
		return luck;
	}

	public void setLuck(Attribute luck) {
		this.luck = luck;
	}

	public Attribute getLife() {
		return life;
	}

	public void setLife(Attribute life) {
		this.life = life;
	}

	public Attribute getDexterity() {
		return dexterity;
	}

	public void setDexterity(Attribute dexterity) {
		this.dexterity = dexterity;
	}

	public GameUser getGameUser() {
		return gameUser;
	}

	public void setGameUser(GameUser gameUser) {
		this.gameUser = gameUser;
	}

	public Vestment getVestiment() {
		return vestiment;
	}

	public void setVestiment(Vestment vestiment) {
		this.vestiment = vestiment;
	}

	public List<ChaIte> getChaItes() {
		return chaItes;
	}

	public void setChaItes(List<ChaIte> chaItes) {
		this.chaItes = chaItes;
	}

	public int getId() {
		return id;
	}

	public boolean isAlive() {
		return alive;
	}

	public void setAlive(boolean alive) {
		this.alive = alive;
	}

}