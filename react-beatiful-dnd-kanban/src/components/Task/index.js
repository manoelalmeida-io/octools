import React from 'react';
import { Draggable } from 'react-beautiful-dnd';

import { Container } from './styles';

function Task({ item, index }) {
  return (
    <Draggable key={item.id} draggableId={item.id} index={index}>
      {(provided, snapshot) => (
        <Container
          isDragging={snapshot.isDragging}
          ref={provided.innerRef}
          {...provided.draggableProps}
          {...provided.dragHandleProps}
        >
          {item.content}
        </Container>
      )
      }
    </Draggable>
  );
}

export default Task;