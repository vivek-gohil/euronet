package com.euronet.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.euronet.model.Employee;

@Component
public class EmployeeDAO {

	private Connection connection = null;
	private PreparedStatement preparedStatement = null;
	private ResultSet resultSet = null;
	private String sql = "";
	private int count;
	private List<Employee> employeeList = null;
	private Employee employee = null;

	@Autowired
	private DataSource dataSource;

	public EmployeeDAO() {
		System.out.println("EmployeeDAO object created");
	}

	public void testConnection() {
		System.out.println("in testConnection");
		try {
			connection = dataSource.getConnection();
			if (connection != null)
				System.out.println("Connection Success");
			else
				System.out.println("Connection Failed");
		} catch (SQLException e) {
			System.out.println("Connection Failed");
			System.out.println(e.getMessage());
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				System.out.println("Faild to close connection");
			}
		}

	}

	public boolean addEmployee(Employee employee) {
		try {
			connection = dataSource.getConnection();
			if (connection != null) {
				// 3. Write sql query
				sql = "insert into employee_master values(?,?,?)";

				// 4. Create Employee Object
				// employee = new Employee(106, "Meena", 1000);

				// 5. Execute SQL Query
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, employee.getEmployeeId());
				preparedStatement.setString(2, employee.getName());
				preparedStatement.setDouble(3, employee.getSalary());

				count = preparedStatement.executeUpdate();

				if (count > 0) {
					return true;
				} else {
					return false;
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean updateEmployee(Employee employee) {
		try {
			connection = dataSource.getConnection();
			if (connection != null) {
				// 3. Write sql query
				sql = "update employee_master set name=? , salary=? where employee_id=?";

				// 4. Create Employee Object
				// Employee employee = new Employee(101, "Vivek G", 10000);

				// 5. Execute SQL Query
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setString(1, employee.getName());
				preparedStatement.setDouble(2, employee.getSalary());
				preparedStatement.setInt(3, employee.getEmployeeId());

				count = preparedStatement.executeUpdate();

				if (count > 0) {
					return true;
				} else {
					return false;
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	public boolean deleteEmployee(int employeeId) {

		try {

			connection = dataSource.getConnection();
			if (connection != null) {
				// 3. Write sql query
				sql = "delete from employee_master where employee_id = ?";

				// int employeeId = 101;
				// 5. Execute SQL Query
				preparedStatement = connection.prepareStatement(sql);

				preparedStatement.setInt(1, employeeId);

				count = preparedStatement.executeUpdate();

				if (count > 0) {
					return true;
				} else {
					return false;
				}

			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return false;
	}

	public Employee getEmployee(int employeeId) {
		try {
			connection = dataSource.getConnection();
			if (connection != null) {
				sql = "select * from employee_master where employee_id = ?";
				// int employeeId = 102;
				preparedStatement = connection.prepareStatement(sql);
				preparedStatement.setInt(1, employeeId);

				resultSet = preparedStatement.executeQuery();
				if (resultSet.next()) {
					int empId = resultSet.getInt("employee_id");
					String name = resultSet.getString("name");
					double salary = resultSet.getDouble("salary");

					employee = new Employee(empId, name, salary);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		return employee;
	}

	public List<Employee> getAllEmployees() {
		try {
			connection = dataSource.getConnection();
			if (connection != null) {
				sql = "select * from employee_master";
				preparedStatement = connection.prepareStatement(sql);
				resultSet = preparedStatement.executeQuery();
				employeeList = new ArrayList<Employee>();
				while (resultSet.next()) {
					int employeeId = resultSet.getInt("employee_id");
					String name = resultSet.getString("name");
					double salary = resultSet.getDouble("salary");

					employee = new Employee(employeeId, name, salary);
					employeeList.add(employee);
				}
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return employeeList;
	}
}
