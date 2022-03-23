package project_1;
public class StudentServiceImpl implements StudentService
{
	private StudentDao dao;
	public StudentServiceImpl()
	{
        dao = new StudentDaoImpl();
	}
	
	@Override
	public void addStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void updateStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void removeStudent(Student student) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public Student findStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
}
