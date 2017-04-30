import React from 'react';
import {render} from 'react-dom';

class WebApplication extends React.Component {
	render() {
		return(
			<h1> arbitrary text </h1>
		);
	}
}

render(<App />, document.getElementById('target'));
