import React from 'react';
import {render} from 'react-dom';

class WebApplication extends React.Component {
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

render(<App />, document.getElementById('target'));
