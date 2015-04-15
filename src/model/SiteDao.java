package model;

import java.util.List;

import javax.persistence.*;
import javax.xml.*;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.xml.bind.*;
import javax.xml.transform.*;
import javax.xml.transform.stream.*;
import javax.persistence.*;
import javax.print.attribute.standard.Media;

@Path("/api")
public class SiteDao {

//EntityManagerFactory;
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("JPA-JWS_CS5200Homework");
	EntityManager em = factory.createEntityManager();
	
	
//findSite
	
	@GET
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	private Site findSite(Integer id){
		return em.find(Site.class, id);
	}
	
//findAllSite
	
	@GET
	@Path("/")
	@Produces(MediaType.APPLICATION_JSON)
	private List<Site> findAllSite(){
		Query query = em.createQuery("select site from Site site");
		return (List<Site>)query.getResultList();
	}
	
//updateSite
	
	@PUT
	@Path("/{id}")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	private List<Site> updateSite(Site site){
		em.getTransaction().begin();
		em.merge(site);
		em.getTransaction().commit();
		
		Query query = em.createQuery("select site from Site site");
		return (List<Site>)query.getResultList();
	}
	 
//removeSite
	
	@DELETE
	@Path("/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	private List<Site> removeSite(Integer id){
		Site site = em.find(Site.class, id);
		em.remove(site);
		
		Query query = em.createQuery("select site from Site site");
		return (List<Site>)query.getResultList();
	}
	
//createSite
	
	@POST
	@Path("/")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	private List<Site> createSite(Site site){
		em.getTransaction().begin();
		em.persist(site);
		em.getTransaction().commit();
		
		Query query = em.createQuery("select site from Site site");
		return (List<Site>)query.getResultList();
	}
	


	public static void main(String[] args){

//Test
		
		SiteDao dao = new SiteDao();
		Site newSite = new Site(null, "newSite", 12.03, 8.01);
		List<Site> siteList = dao.createSite(newSite);
		
		for(Site site : siteList){
			System.out.println(site.getName());
		}
	} 

	
}
