package com.m2i.formation.media;

public class Item implements Iitem {
	private int id;
	private String title;
	private double price;                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.Iitem#afficher()
	 */
	@Override
	public void afficher(){
		System.out.println(" The title  : " + title);
		System.out.println(" Its Id is : " + id);
		System.out.println(" It costs : " + price+" $ ");
		System.out.println(" ");
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.Iitem#getId()
	 */
	@Override
	public int getId() {
		return id;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.Iitem#setId(int)
	 */
	@Override
	public void setId(int id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.Iitem#getTitle()
	 */
	@Override
	public String getTitle() {
		return title;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.Iitem#setTitle(java.lang.String)
	 */
	@Override
	public void setTitle(String title) {
		this.title = title;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.Iitem#getPrice()
	 */
	@Override
	public double getPrice() {
		return price;
	}
	/* (non-Javadoc)
	 * @see com.m2i.formation.media.Iitem#setPrice(double)
	 */
	@Override
	public void setPrice(double price) {
		this.price = price;
	}
	
}
