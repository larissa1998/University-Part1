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
    'label': ['2015', '2016', '2017', '2018'],
    'values': [
      {
        'label': 'Londrina',
        'values': [1, 0, 2, 0]
      },
      {
        'label': 'Curitiba',
        'values': [1, 0, 2, 0]
      },
      {
        'label': 'Campo Mourao',
        'values': [1, 1, 0, 0]
      },
      {
        'label': 'Castro',
        'values': [1, 0, 2, 2]
      }]

  };
  //end
  var json2 = {
    'values': [
      {
        'label': 'date A',
        'values': [10, 40, 15, 7]
      },
      {
        'label': 'date B',
        'values': [30, 40, 45, 9]
      },
      {
        'label': 'date D',
        'values': [55, 30, 34, 26]
      },
      {
        'label': 'date C',
        'values': [26, 40, 85, 28]
      }]

  };
  //init BarChart
  var barChart = new $jit.BarChart({
    //id of the visualization container
    injectInto: 'infovis',
    //whether to add animations
    animate: true,
    //horizontal or vertical barcharts
    orientation: 'horizontal',
    //bars separation
    barsOffset: 0.5,
    //visualization offset
    Margin: {
      top: 5,
      left: 5,
      right: 5,
      bottom: 5
    },
    //labels offset position
    labelOffset: 5,
    //bars style
    type: 'stacked',
    //whether to show the aggregation of the values
    showAggregates: true,
    //whether to show the labels for the bars
    showLabels: true,
    //label styles
    Label: {
      type: labelType, //Native or HTML
      size: 13,
      family: 'Arial',
      color: 'white'
    },
    //tooltip options
    Tips: {
      enable: true,
      onShow: function (tip, elem) {
        tip.innerHTML = "<b>" + elem.name + "</b>: " + elem.value;
      }
    }
  });
  //load JSON data.
  barChart.loadJSON(json);
  //end
  var list = $jit.id('id-list'),
    button = $jit.id('update');
  //update json on click 'Update Data'
  $jit.util.addEvent(button, 'click', function () {
    var util = $jit.util;
    if (util.hasClass(button, 'gray')) return;
    util.removeClass(button, 'white');
    util.addClass(button, 'gray');
    barChart.updateJSON(json2);
  });
  //dynamically add legend to list
  var legend = barChart.getLegend(),
    listItems = [];
  for (var name in legend) {
    listItems.push('<div class=\'query-color\' style=\'background-color:'
      + legend[name] + '\'>&nbsp;</div>' + name);
  }
  list.innerHTML = '<li>' + listItems.join('</li><li>') + '</li>';
}
