package ljdp.minechem.api.core;

import static ljdp.minechem.api.core.EnumElement.*;

import java.util.ArrayList;
import java.util.Random;


import net.minecraft.item.ItemStack;

public enum EnumMolecule {
	cellulose 				(0, "Cellulose", new Element(C, 6), new Element(H, 10), new Element(O, 5)),
	water					(1, "Water", new Element(H,2), new Element(O)),
	carbonDioxide   		(2, "Carbon Dioxide", new Element(C), new Element(O,2)),
	nitrogenDioxide 		(3, "Nitrogen Dioxide", new Element(N), new Element(O,2)),
	toluene					(4, "Toluene", new Element(C,7), new Element(H,8)),
	potassiumNitrate 		(5, "Potassium Nitrate", new Element(K), new Element(N), new Element(O,3)),
	tnt 					(6, "Trinitrotoluene", 
			new Element(C,6), 
			new Element(H,2), 
			new Molecule(nitrogenDioxide, 3), 
			new Molecule(toluene)
			),
	siliconDioxide			(7, "Silicon Dioxide", new Element(Si), new Element(O,2)),
	calcite					(8, "Calcite", new Element(Ca), new Element(C), new Element(O,3)),
	pyrite					(9, "Pyrite", new Element(Fe), new Element(S,2)),
	nepheline				(10, "Nepheline", new Element(Al), new Element(Si), new Element(O,4)),
	sulfate					(11, "Sulfate", new Element(S), new Element(O,4)),
	noselite				(12, "Noselite", new Element(Na,8), new Molecule(nepheline,6), new Molecule(sulfate)),
	sodalite				(13, "Sodalite", new Element(Na,8), new Molecule(nepheline,6), new Element(Cl,2)),
	nitrate					(14, "Nitrate", new Element(N), new Element(O,3)),
	carbonate				(15, "Carbonate", new Element(C), new Element(O,3)),
	cyanide					(16, "Cyanide", new Element(C), new Element(N)),
	phosphate				(17, "Phosphate", new Element(P), new Element(O,4)),
	acetate					(18, "Acetate", new Element(C,2), new Element(H,3), new Element(O,2)),
	chromate				(19, "Chromate", new Element(Cr), new Element(O,4)),
	hydroxide				(20, "Hydroxide", new Element(O), new Element(H)),
	ammonium				(21, "Ammonium", new Element(N), new Element(H,4)),
	hydronium				(22, "Hydronium", new Element(H,3), new Element(O)),
	peroxide				(23, "Peroxide", new Element(O,2)),
	calciumOxide			(24, "Calcium Oxide", new Element(Ca), new Element(O)),
	calciumCarbonate		(25, "Calcium Carbonate", new Element(Ca), new Molecule(carbonate)),
	magnesiumCarbonate		(26, "Magnesium Carbonate", new Element(Mg), new Molecule(carbonate)),
	lazurite				(27, "Lazurite", new Element(Na,8), new Molecule(nepheline), new Molecule(sulfate)),
	isoprene				(28, "Isoprene", new Element(C,5), new Element(H,8)),
	butene					(29, "Butene", new Element(C,4), new Element(H,8)),
	polyisobutylene			(30, "Polyisobutylene", new Molecule(butene,16), new Molecule(isoprene)),
	malicAcid				(31, "Malic Acid", new Element(C,4), new Element(H,6), new Element(O,5)),
	vinylChloride			(32, "Vinyl Chloride", new Element(C,2), new Element(H,3), new Element(Cl)),
	polyvinylChloride		(33, "Polyvinyl Chloride", new Molecule(vinylChloride,64)),
	methamphetamine 		(34, "Methamphetamine", new Element(C,10), new Element(H,15), new Element(N)),
	psilocybin				(35, "Psilocybin", new Element(C,12), new Element(H,17), new Element(N,2), new Element(O,4), new Element(P)),
	iron3oxide				(36, "Iron (III) Oxide", new Element(Fe,2), new Element(O,3)),
	strontiumNitrate		(37, "Strontium Nitrate", new Element(Sr), new Molecule(nitrate, 2)),
	magnetite				(38, "Magnetite", new Element(Fe,3), new Element(O,4)),
	magnesiumOxide			(39, "Magnesium Oxide", new Element(Mg), new Element(O)),
	cucurbitacin			(40, "Cucurbitacin", new Element(C,30), new Element(H,42), new Element(O,7)),
	asparticAcid			(41, "Aspartic Acid", new Element(C,4), new Element(H,7), new Element(N), new Element(O,4)),
	hydroxylapatite			(42, "Hydroxylapatite", new Element(Ca,5), new Molecule(phosphate,3), new Element(O), new Element(H)),
	alinine					(43, "Alinine", new Element(C,3), new Element(H,7), new Element(N), new Element(O,2)),
	glycine					(44, "Glycine", new Element(C,2), new Element(H,5), new Element(N), new Element(O,2)),
	serine					(45, "Serine",  new Element(C,3), new Element(H,7), new Molecule(nitrate)),
	mescaline				(46, "Mescaline", new Element(C,11), new Element(H,17), new Molecule(nitrate)),
	methyl					(47, "Methyl", new Element(C), new Element(H,3)),
	methylene				(48, "Methylene", new Element(C), new Element(H,2)),
	cyanoacrylate			(49, "Cyanoacrylate", new Molecule(methyl), new Molecule(methylene), new Element(C,3), new Element(N), new Element(H), new Element(O,2)),
	polycyanoacrylate		(50, "Poly-cyanoacrylate", new Molecule(cyanoacrylate, 3)),
	redPigment				(51, "Cobalt(II) nitrate", new Element(Co), new Molecule(nitrate,2)),
	orangePigment			(52, "Potassium Dichromate", new Element(K,2), new Element(Cr,2), new Element(O,7)),
	yellowPigment			(53, "Potassium Chromate", new Element(Cr), new Element(K,2), new Element(O,4)),
	limePigment				(54, "Nickel(II) Chloride", new Element(Ni), new Element(Cl,2)),
	lightbluePigment		(55, "Copper(II) Sulfate", new Element(Cu), new Molecule(sulfate)),
	purplePigment			(56, "Potassium Permanganate", new Element(K), new Element(Mn), new Element(O,4)),
	greenPigment			(57, "Zinc Green", new Element(Co), new Element(Zn), new Element(O,2)),
	blackPigment			(58, "Carbon Black", new Element(C), new Element(H,2), new Element(O)),
	whitePigment			(59, "Titanium Dioxide", new Element(Ti), new Element(O,2)),
	metasilicate			(60, "Metasilicate", new Element(Si), new Element(O,3)),
	beryl					(61, "Beryl", new Element(Be,3), new Element(Al,2), new Molecule(metasilicate, 6)),
	ethanol					(62, "Ethyl Alchohol", new Element(C,2), new Element(H,6), new Element(O)),
	amphetamine				(63, "Aphetamine", new Element(C,9), new Element(H,13), new Element(N)),
	theobromine				(64, "Theobromine", new Element(C,7), new Element(H,8), new Element(N,4), new Element(O,2)),
	starch					(65, "Starch", new Molecule(cellulose,2)),
	sucrose					(66, "Sucrose", new Element(C,12), new Element(H,22), new Element(O,11)),
	muscarine				(67, "Muscarine", new Element(C,9), new Element(H,20), new Element(N), new Element(O,2)),
	aluminiumOxide			(68, "Aluminium Oxide", new Element(Al,2), new Element(O,3)),
	;
	
	public static EnumMolecule[] molecules = values();
	private final String descriptiveName;
	private final ArrayList<Chemical> components;
	private int id;
	public float red;
	public float green;
	public float blue;
	public float red2;
	public float green2;
	public float blue2;
	EnumMolecule(int id, String descriptiveName, Chemical...chemicals) {
		this.id = id;
		this.components = new ArrayList<Chemical>();
		this.descriptiveName = descriptiveName;
		for(Chemical chemical : chemicals) {
			this.components.add(chemical);
		}
		Random random = new Random(id);
		this.red = random.nextFloat();
		this.green = random.nextFloat();
		this.blue = random.nextFloat();
		this.red2 = random.nextFloat();
		this.green2 = random.nextFloat();
		this.blue2 = random.nextFloat();
	}

	public static EnumMolecule getById(int id) {
		for(EnumMolecule molecule : molecules) {
			if(molecule.id == id)
				return molecule;
		}
		return null;
	}
	
	public int id() {
		return this.id;
	}
	
	public String descriptiveName() {
		return this.descriptiveName;
	}
	
	public ArrayList<Chemical> components() {
		return this.components;
	}
	
}