const React = require('react');
const ReactDOM =  require ('react-dom');
const client = require('./client');

class App extends React.Component {
    constructor(props) {
        super(props);
        this.state = {employees: []};
    }
    componentDidMount() {
        client({method: 'GET', path: '/api/employees'}).done(response => {
            this.setState({employees: response.entity._embedded.employees});
        });
    }

	render() {
		return(
            <EmployeeList Employees={this.state.employees}/>
		)
	}
}

class EmployeeList extends React.Component {
    render() {
        var employees = this.props.employees.map(employee =>
            <Employee key={employee._links.self.href} employee={employee}/>
        );
        return (
            <table>
                <tbody>
                  <div>test</div>
                    <tr>
                        <th>First Name</th>
                        <th>Surname</th>
                        <th>Description</th>
                    </tr>
                    {employees}
                </tbody>
            </table>
        )
    }
}

class Employee extends React.Component{
    render() {
        return (
                <tr>
                    <td>{this.props.employee.FirstName}</td>
                    <td>{this.props.employee.Surname}</td>
                    <td>{this.props.employee.description}</td>
                </tr>
        )
    }
}

ReactDOM.render(
    <App />,
    document.getElementById('react')
)