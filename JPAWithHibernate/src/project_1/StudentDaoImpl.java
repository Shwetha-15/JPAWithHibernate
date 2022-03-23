package project_1;
import project_1.Student;
import javax.persistence.EntityManager;
public class StudentDaoImpl implements StudentDao
{
	private EntityManager entityManager;
	public StudentDaoImpl() 
	{
	    entityManager = JPAUtil.getEntityManager();
	}
	
	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void commitTransaction() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void beginTransaction() {
		// TODO Auto-generated method stub
		
	}
}
