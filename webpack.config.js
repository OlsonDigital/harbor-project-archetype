const path = require( 'path' );
const ExtractTextPlugin = require( 'extract-text-webpack-plugin' );

const extractSass = new ExtractTextPlugin( {
    filename: "static.css"
} );

module.exports = {
    entry: './src/main/design/index.js',
    output: {
        filename: 'static.js',
        path: path.resolve( __dirname, 'src/main/resources/archetype-resources/__rootArtifactId__-ui/src/main/content/jcr_root/etc/designs/__rootArtifactId__' )
    },
    module: {
        rules: [
            {
                test: /\.scss$/,
                use: extractSass.extract( {
                    use: [
                        { loader: "css-loader" },
                        { loader: "sass-loader" }
                    ]
                } )
            },
            {
                test: /\.(woff|woff2|eot|ttf|otf|svg)$/,
                use: [
                    'file-loader?name=[name].[ext]&outputPath=fonts/'
                ]
            }
        ]
    },
    plugins: [
        extractSass
    ]
};
