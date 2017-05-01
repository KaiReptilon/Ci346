import React from 'react';
import {render} from 'react-dom';

class App extends React.Component {
    entity;
    _embedded;
    constructor(props) {
        super(props);
        this.state = {Employees: []};
    }
    componentDidMount() {
        client({method: 'GET', path: '/api/Employees'}).done(response => {
            this.setState({Employees: response.entity._embedded.Employees});
        });
    }

	render() {
		return(
            <EmployeeList Employees={this.state.Employees}/>
		)
	}
}

class EmployeeList extends React.Component{
    _links;
    render() {
        var employees = this.props.Employees.map(employee =>
            <Employee key={employee._links.self.href} employee={employee}/>
        );
        return (
                <table>
                    <tbody>
                        <tr>
                            <th>First Name</th>
                            <th>Surname</th>
                            <th>Shift Start</th>
                            <th>Shift Finish</th>
                            <th>Shift Type</th>
                        </tr>
                        {employees}
                    </tbody>
                </table>
        )
    }
}

class Employee extends React.Component {
    render() {
        return (
            <tr>
                <td>this.props.employee.firstName</td>
                <td>this.props.employee.surname</td>
                <td>this.props.employee.shiftStart</td>
                <td>this.props.employee.shiftFinish</td>
                <td>this.props.employee.shiftType</td>
            </tr>
        )
    }
}


render(
    <App />,
    document.getElementById('react')
)
