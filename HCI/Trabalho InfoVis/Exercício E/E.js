var labelType, useGradients, nativeTextSupport, animate;

(function () {
    var ua = navigator.userAgent,
        iStuff = ua.match(/iPhone/i) || ua.match(/iPad/i),
        typeOfCanvas = typeof HTMLCanvasElement,
        nativeCanvasSupport = (typeOfCanvas == 'object' || typeOfCanvas == 'function'),
        textSupport = nativeCanvasSupport
            && (typeof document.createElement('canvas').getContext('2d').fillText == 'function');
    //I'm setting this based on the fact that ExCanvas provides text support for IE
    //and that as of today iPhone/iPad current text support is lame
    labelType = (!nativeCanvasSupport || (textSupport && !iStuff)) ? 'Native' : 'HTML';
    nativeTextSupport = labelType == 'Native';
    useGradients = nativeCanvasSupport;
    animate = !(iStuff || !nativeCanvasSupport);
})();

var Log = {
    elem: false,
    write: function (text) {
        if (!this.elem)
            this.elem = document.getElementById('log');
        this.elem.innerHTML = text;
        this.elem.style.left = (500 - this.elem.offsetWidth / 2) + 'px';
    }
};


function init() {
    //init data
    var json = {
        "id": "347_0",
        "name": "Cidades",
        "children": [{
            "id": "126510_1",
            "name": "Londrina",
            "data": {
                "relation": "Cidade Paranaense"
            },
            "children": [{
                "id": "52163_2",
                "name": "6.09",
                "data": {
                    "relation": "Valor"
                },
                "children": []
            }]
        }, {
            "id": "173871_4",
            "name": "Curitiba",
            "data": {
                "relation": "Cidade Paranaense"
            },

            "children": [{
                "id": "52163_222",
                "name": "5.05",
                "data": {
                    "relation": "Valor"
                },
                "children": []
            }]
        },
        {
            "id": "235951_6",
            "name": "Campo Mourao",
            "data": {
                "relation": "Cidade Paranaense"
            },
            "children": [{
                "id": "2382_7",
                "name": "7.2",
                "data": {
                    "relation": "Valor"
                },
                "children": []
            }]
        }, {
            "id": "235950_11",
            "name": "Castro",
            "data": {
                "relation": "Cidade Paranaense"
            },
            "children": [{
                "id": "1007_12",
                "name": "5",
                "data": {
                    "relation": "Valor"
                },
                "children": []
            }]

        }],
        "data": []
    };
    //end
    var infovis = document.getElementById('infovis');
    var w = infovis.offsetWidth - 50, h = infovis.offsetHeight - 50;

    //init Hypertree
    var ht = new $jit.Hypertree({
        //id of the visualization container
        injectInto: 'infovis',
        //canvas width and height
        width: w,
        height: h,
        //Change node and edge styles such as
        //color, width and dimensions.
        Node: {
            dim: 9,
            color: "#f00"
        },
        Edge: {
            lineWidth: 2,
            color: "#088"
        },
        onBeforeCompute: function (node) {
            Log.write("centering");
        },
        //Attach event handlers and add text to the
        //labels. This method is only triggered on label
        //creation
        onCreateLabel: function (domElement, node) {
            domElement.innerHTML = node.name;
            $jit.util.addEvent(domElement, 'click', function () {
                ht.onClick(node.id, {
                    onComplete: function () {
                        ht.controller.onComplete();
                    }
                });
            });
        },
        //Change node styles when labels are placed
        //or moved.
        onPlaceLabel: function (domElement, node) {
            var style = domElement.style;
            style.display = '';
            style.cursor = 'pointer';
            if (node._depth <= 1) {
                style.fontSize = "0.8em";
                style.color = "#ddd";

            } else if (node._depth == 2) {
                style.fontSize = "0.7em";
                style.color = "#555";

            } else {
                style.display = 'none';
            }

            var left = parseInt(style.left);
            var w = domElement.offsetWidth;
            style.left = (left - w / 2) + 'px';
        },

        onComplete: function () {
            Log.write("done");

            //Build the right column relations list.
            //This is done by collecting the information (stored in the data property) 
            //for all the nodes adjacent to the centered node.
            var node = ht.graph.getClosestNodeToOrigin("current");
            var html = "<h4>" + node.name + "</h4><b>Connections:</b>";
            html += "<ul>";
            node.eachAdjacency(function (adj) {
                var child = adj.nodeTo;
                if (child.data) {
                    var rel = (child.data.band == node.name) ? child.data.relation : node.data.relation;
                    html += "<li>" + child.name + " " + "<div class=\"relation\">(relation: " + rel + ")</div></li>";
                }
            });
            html += "</ul>";
            $jit.id('inner-details').innerHTML = html;
        }
    });
    //load JSON data.
    ht.loadJSON(json);
    //compute positions and plot.
    ht.refresh();
    //end
    ht.controller.onComplete();
}
