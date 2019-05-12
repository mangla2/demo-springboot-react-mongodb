const webpack = require('webpack');
var path = require('path');

module.exports = {
		entry:  ['babel-polyfill','./src/main/js/index.js'],
		output: {
			path: __dirname,
			filename: './src/main/resources/static/built/bundle.js'
		},
		module: {
			rules: [
				{
					test: /\.js[x]?$/,
					exclude: /node_modules/,
					use: {
						loader: 'babel-loader'
					}
				},
				]
		}
};