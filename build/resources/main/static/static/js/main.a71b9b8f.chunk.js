(this["webpackJsonpmy-app"]=this["webpackJsonpmy-app"]||[]).push([[0],{40:function(e,t,n){e.exports=n(70)},45:function(e,t,n){},47:function(e,t,n){},70:function(e,t,n){"use strict";n.r(t);var a=n(0),r=n.n(a),o=n(15),c=n.n(o),i=(n(45),n(46),n(47),n(10)),l=n(11),s=n(13),u=n(12),m=n(73),h=n(33),d=n(8),p=n(32),f=n.n(p),b=function(e){Object(s.a)(n,e);var t=Object(u.a)(n);function n(e){var a;return Object(i.a)(this,n),(a=t.call(this,e)).getApi=function(){f.a.get("http://localhost:8080/example").then((function(e){console.log(e),a.setState({message:e.data.message})})).catch((function(e){return console.log(e)}))},a.state={message:""},a}return Object(l.a)(n,[{key:"componentDidMount",value:function(){this.getApi()}},{key:"render",value:function(){return r.a.createElement("div",null,"Main \ud398\uc774\uc9c0",r.a.createElement("br",null),this.state.message)}}]),n}(a.Component),v=function(e){Object(s.a)(n,e);var t=Object(u.a)(n);function n(){return Object(i.a)(this,n),t.apply(this,arguments)}return Object(l.a)(n,[{key:"render",value:function(){return r.a.createElement("div",null,"Dashboard \ud398\uc774\uc9c0")}}]),n}(a.Component),E=function(e){Object(s.a)(n,e);var t=Object(u.a)(n);function n(){return Object(i.a)(this,n),t.apply(this,arguments)}return Object(l.a)(n,[{key:"render",value:function(){return r.a.createElement(h.a,null,r.a.createElement(m.a,{bg:"dark",variant:"dark",className:"mb-4"},r.a.createElement(m.a.Brand,{href:"/"},"Home"),r.a.createElement(m.a.Brand,{href:"/main"},"Main"),r.a.createElement(m.a.Brand,{href:"/dashboard"},"Dashboard")),r.a.createElement(d.a,{path:"/main",component:b}),r.a.createElement(d.a,{path:"/dashboard",component:v}))}}]),n}(a.Component);var g=function(){return r.a.createElement("div",{className:"App"},r.a.createElement("div",null,r.a.createElement(E,null)))};Boolean("localhost"===window.location.hostname||"[::1]"===window.location.hostname||window.location.hostname.match(/^127(?:\.(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)){3}$/));c.a.render(r.a.createElement(r.a.StrictMode,null,r.a.createElement(g,null)),document.getElementById("root")),"serviceWorker"in navigator&&navigator.serviceWorker.ready.then((function(e){e.unregister()})).catch((function(e){console.error(e.message)}))}},[[40,1,2]]]);
//# sourceMappingURL=main.a71b9b8f.chunk.js.map