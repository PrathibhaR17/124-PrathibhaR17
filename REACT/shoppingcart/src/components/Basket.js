import React from 'react';

export default function Basket(props) {
  const { cartItems, onAdd, onRemove } = props;
  const itemsPrice = cartItems.reduce((a, c) => a + c.qty * c.price, 0);
 
  const totalPrice = itemsPrice ;
  return (
    <aside className="block row-1">
            <h2>Cart </h2>
      <div>
        {cartItems.length === 0 && <div>Empty</div>}
        {cartItems.map((item) => (
          <div key={item.id} className="row">
            <div className="col-2">{item.name}</div>
            <div className="col-2"><img className="small" src={item.image} alt={item.name} /></div>
            <div className="col-2">
              <button onClick={() => onRemove(item)} className="remove">
                  -
              </button>{' '}
              <button onClick={() => onAdd(item)} className="add">
                +
              </button>
            </div>

            <div className="col-2 text-right">
              {item.qty} * {item.price.toFixed(2)}
            </div>
          </div>
        ))}

        {cartItems.length !== 0 && (
          <>
            
            <div className="row">
              {/* <div className="col-2"> Price</div> */}
              {/* <div className="col-1 text-right">Total{itemsPrice.toFixed(2)}</div> */}
            </div>
        <br />
            <div className="row">
              {/* <div className="col-2">
                <strong> Price</strong>
              </div> */}
              <div className="col-1 text-right">
                <strong>TotalPrice{totalPrice.toFixed(2)}</strong>
              </div>
            </div>
            <br />
            <div className="row">
              <button onClick={() => alert('SUCCESSFULLY PLACED!')}>
                Order
              </button>
              
            </div>
          </>
        )}
      </div>

    </aside>
  );
}
